. set_env.sh

# build
mvn clean install assembly:assembly

# start
java -cp target/soapexample-jar-with-dependencies.jar soapexample.SoapExample
