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

- `find`: Search for files and directories.
  ```bash
  find /path -name filename
  ```
- `grep`: Search for patterns in files.
  ```bash
  grep "pattern" filename
  ```

---

### 8. **Shortcuts and Help**

- `man`: Display the manual page for a command.
  ```bash
  man ls
  ```
- `history`: View the history of executed commands.
  ```bash
  history
  ```
- `clear`: Clear the terminal screen.
  ```bash
  clear
  ```

---

### Practice Tips
1. Try creating files and folders, navigating between directories, and manipulating files.
2. Use `ls -l` frequently to check permissions.
3. Experiment with `chmod` and `chown` to understand permissions better.
4. Use `man` to explore details about commands.
5. Practice searching with `find` and `grep`.

Let me know if you need help with specific commands or tasks! 😊


