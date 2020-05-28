# RPI


/usr/local/sbin/mosquitto

mvn clean package
./target/mqtt-sample subscriber

mysql.server start

in the other terminal
./target/mqtt-sample publisher '{"id":1,"sensorType":"1","temperatureValue":10.0}'


brew services start grafana
grafana 1-0



