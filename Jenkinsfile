@Library('deployable-ref-pipeline') _
//sbPipeline()

withCredentials([
usernamePassword(credentialsId: 'TEST_USER_CRE', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD'),
usernamePassword(credentialsId: 'DB_TEST', usernameVariable: 'DB_USERNAME', passwordVariable: 'DB_PASSWORD')
])

{
	echo "TEST_USER: ${env.USERNAME}"
	echo "TEST_PASS: ${env.PASSWORD}"
	sbPipeline(
	testUser:["TEST_USER" : "${env.USERNAME}","TEST_PASS" : "${env.PASSWORD}"],
	dbUser:["TEST_USER_DB" : "${env.DB_USERNAME}","TEST_USER_PASS" : "${env.DB_PASSWORD}"]
	)
	echo "dbUser: ${dbUser}"
	echo "TEST_USER1: ${TEST_USER_DB}"
	echo "TEST_PASS1: ${TEST_USER_PASS}"

}



