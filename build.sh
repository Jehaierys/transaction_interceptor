docker rmi transaction-interceptor:latest || true
docker build -t transaction-interceptor:latest .
# ./build.sh - command