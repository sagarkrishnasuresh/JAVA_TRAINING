## Basic Linux Commands for Beginners

### 1. **File and Directory Management**

#### **Navigation**
- `pwd`: Print the current working directory.
  ```bash
  pwd
  ```
- `ls`: List files and directories.
  ```bash
  ls
  ls -l     # Detailed view
  ls -a     # Show hidden files
  ```
- `cd`: Change the current directory.
  ```bash
  cd /path/to/directory
  cd ..      # Go up one directory
  cd ~       # Go to the home directory
  ```

#### **Creating and Deleting Files/Directories**
- `touch`: Create an empty file.
  ```bash
  touch filename.txt
  ```
- `mkdir`: Create a new directory.
  ```bash
  mkdir myfolder
  ```
- `rm`: Remove files or directories.
  ```bash
  rm filename.txt          # Remove a file
  rm -r foldername         # Remove a folder and its contents
  ```
- `cp`: Copy files or directories.
  ```bash
  cp source.txt destination.txt
  cp -r source_folder destination_folder
  ```
- `mv`: Move or rename files and directories.
  ```bash
  mv oldname.txt newname.txt   # Rename file
  mv file.txt /path/to/folder  # Move file
  ```

#### **Viewing Files**
- `cat`: Display file contents.
  ```bash
  cat filename.txt
  ```
- `nano`: Open a file in the Nano text editor.
  ```bash
  nano filename.txt
  ```
- `less`: View file contents one screen at a time.
  ```bash
  less filename.txt
  ```

---

### 2. **File Permissions and Ownership**

#### **Viewing Permissions**
- `ls -l`: Show detailed file permissions.
  ```bash
  ls -l
  ```

#### **Changing Permissions**
- `chmod`: Modify file permissions.
  ```bash
  chmod 755 filename       # rwxr-xr-x
  chmod u+x filename       # Add execute for the owner
  chmod -R 777 foldername  # Apply recursively to a folder
  ```

#### **Changing Ownership**
- `chown`: Change file owner and group.
  ```bash
  sudo chown user:group filename
  sudo chown -R user:group foldername
  ```

---

### 3. **Process Management**

- `ps`: Display running processes.
  ```bash
  ps
  ps aux  # Show all processes
  ```
- `top`: Monitor system processes and resource usage in real time.
  ```bash
  top
  ```
- `kill`: Terminate a process.
  ```bash
  kill PID
  kill -9 PID  # Force kill
  ```
- `htop`: A user-friendly process viewer (install if needed).
  ```bash
  htop
  ```

---

### 4. **Disk and System Information**

- `df -h`: Show disk space usage.
  ```bash
  df -h
  ```
- `du -sh foldername`: Show folder size.
  ```bash
  du -sh foldername
  ```
- `free -h`: Display memory usage.
  ```bash
  free -h
  ```
- `uname -a`: Display system information.
  ```bash
  uname -a
  ```
- `uptime`: Show system uptime.
  ```bash
  uptime
  ```

---

### 5. **Networking Commands**

- `ping`: Check network connectivity.
  ```bash
  ping google.com
  ```
- `curl`: Fetch data from a URL.
  ```bash
  curl http://example.com
  ```
- `ifconfig` or `ip addr`: View network configuration (use `ip addr` for modern systems).
  ```bash
  ip addr
  ```
- `netstat`: View active network connections.
  ```bash
  netstat -tuln
  ```

---

### 6. **Archiving and Compression**

- `tar`: Archive files.
  ```bash
  tar -cvf archive.tar file1 file2
  tar -xvf archive.tar       # Extract
  ```
- `gzip`: Compress files.
  ```bash
  gzip file.txt
  gunzip file.txt.gz         # Decompress
  ```

---

### 7. **Search and Find**

#### **Searching Using `find`**
- Search for files by name:
  ```bash
  find /path/to/search -name "filename"
  ```
- Search by file type:
  ```bash
  find /path/to/search -type f   # Find files
  find /path/to/search -type d   # Find directories
  ```
- Search by size:
  ```bash
  find /path/to/search -size +10M   # Files larger than 10MB
  ```
- Search by modification time:
  ```bash
  find /path/to/search -mtime -7   # Files modified in the last 7 days
  ```

#### **Searching Using `grep`**
- Search for a pattern in a file:
  ```bash
  grep "pattern" filename
  ```
- Search recursively in a directory:
  ```bash
  grep -r "pattern" /path/to/directory
  ```
- Ignore case sensitivity:
  ```bash
  grep -i "pattern" filename
  ```

---

### 8. **Viewing Large Files with `less`**

The `less` command allows you to view large files one screen at a time.

#### **Usage**
- Open a file with `less`:
  ```bash
  less filename
  ```

#### **Navigation in `less`**
- `Space`: Scroll forward one page.
- `b`: Scroll backward one page.
- `/pattern`: Search for a pattern in the file.
  ```bash
  /pattern
  ```
- `n`: Move to the next occurrence of the search.
- `q`: Quit `less`.

---

### Practice Tips
1. Try creating files and folders, navigating between directories, and manipulating files.
2. Use `ls -l` frequently to check permissions.
3. Experiment with `chmod` and `chown` to understand permissions better.
4. Use `man` to explore details about commands.
5. Practice searching with `find` and `grep`.
6. Use `less` for efficiently viewing large files.

