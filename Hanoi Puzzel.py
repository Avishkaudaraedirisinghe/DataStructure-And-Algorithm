def hanoi(n, source, auxiliary, target):
    if n == 1:
        print(f"Move disk 1 from {source} to {target}")
        return
    hanoi(n-1, source, target, auxiliary)
    print(f"Move disk {n} from {source} to {target}")
    hanoi(n-1, auxiliary, source, target)

# Example usage:
n = 3  # Number of disks
hanoi(n, 'A', 'B', 'C')
