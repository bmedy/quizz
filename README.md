# quizz

## docker
### build
docker --tls build -t bmedy/quizz .

### verify
docker --tls run -t bmedy/quizz java -version

### run
docker --tls run -d -p 80:8080 -t bmedy/quizz