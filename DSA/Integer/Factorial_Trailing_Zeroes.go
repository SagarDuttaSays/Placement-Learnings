func trailingZeroes(n int) int {
    divisor := 5
    zeroes := 0
    for divisor <= n {
        zeroes += n / divisor
        divisor *= 5
    }
    
    return zeroes
}
