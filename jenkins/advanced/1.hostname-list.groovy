hostname = 'kavinschool.com'
println InetAddress.getByName(hostname).address.collect { addr -> addr & 0xFF }.join('.')
