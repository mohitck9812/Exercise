# 🐧 **Linux Command Tasks – DevOps Reference Guide**

> A handy collection of essential Linux commands for system administration, networking, and DevOps practice.

---

## ⚙️ 1. Find and Terminate the Top Memory-Consuming Process

```bash
ps -eo pid,comm,%mem --sort=-%mem | awk 'NR == 2 {system("kill -15 " $1)}'
🧩 Explanation

ps → Displays running processes.

-e / -A → Show all running processes.

ps -ef → Full-format listing.

ps aux → BSD-style format.

-o → Output formatter (custom columns).

awk → Text processor (named after Aho, Weinberger, Kernighan).

NR == 2 → Selects the 2nd line (top process).

$1 → Refers to PID column.

kill -15 → Graceful kill (use -9 for forceful termination).
```

## 👤 2. Create a User Named devops and Grant Sudo Privileges
``` bash
sudo adduser devops
sudo usermod -aG sudo devops
```
📝 Notes

adduser → Creates a new user.

usermod -aG sudo → Adds the user to the sudo (admin) group.


## 🔗 3. Connect to a Remote Server, Create a Directory & Copy Files (SCP)
<details> <summary>💻 Step-by-step Setup</summary>
🛠️ Step 1: Install SSH Server (installed by default)

sudo apt install openssh-server -y

🔍 Step 2: Check SSH Service Status

sudo systemctl status ssh

📤 Step 3: Copy Files to Remote Server

scp file.txt user@remote_ip:/path/to/destination

📘 Notes

systemctl → Manages systemd services.

openssh-server → Enables remote SSH connections.

</details>

## ☕ 4. List Active “Java” Processes and Save to File

```bash
ps -ef | grep java > java_processes.txt
```

🧠 Explanation

grep java → Filters for processes containing "java".

> → Redirects output to file.

## 🔐 5. Generate SSH Key Pair and Configure on Remote Servers

```bash
ssh-keygen -t rsa -b 4096 -C "mohit@mydevice"
```

🔑 Then copy the key to remote server

```bash
ssh-copy-id user@remote_ip
```
🧩 Explanation

-t rsa → Key type.

-b 4096 → Key size.

-C → Comment/identifier for the key.

## ⚠️ 6. Find All “error” Lines in /var/log/syslog

```bash
grep "error" /var/log/syslog > errors_found.txt
```
📄 Saves all log lines containing “error” into errors_found.txt.

## 🧾 7. Find All .conf Files in /etc and Save Alphabetically

```bash
find /etc -type f -name "*.conf" | sort > conf_list.txt
```

## 🐚 8. Display Total Number of Unique Shell Types

```bash
cut -d: -f7 /etc/passwd | sort | uniq | wc -l > shell_count.txt
```

## ✏️ 9. Vim – Basic Commands

🧭 Action	🧩 Command
Enter insert mode	i
Append text	a
Delete a line	dd
Paste content	p
Undo	u
Redo	Ctrl + r
Search text	/text
Save and quit	:wq
Quit without saving	:q!

## 🔑 10. Reset Current User Password and Reboot
```bash
whoami
sudo passwd $(whoami)
sudo reboot
```

## 📦 11. Zip Home Directory and Transfer via SCP
🗜️ Compress Home Directory
```bash
tar -cvf home_backup.tar ~
```

🚀 Send to Another Machine
```bash
scp home_backup.tar user@remote_ip:/path/to/destination
```

📂 Extract on Remote Machine
```bash
tar -xvf home_backup.tar
```

👨‍💻 Author
Name: Mohit 
📘 Purpose: Quick reference guide for essential Linux commands used in DevOps and system administration.
