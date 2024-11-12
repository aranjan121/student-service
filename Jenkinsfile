@Library('deployable-ref-pipeline') _
//sbPipeline()

withCredentials([
usernamePassword(credentialsId: 'TEST_USER_CRE', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD'),
usernamePassword(credentialsId: 'DB_TEST', usernameVariable: 'DB_USERNAME', passwordVariable: 'DB_PASSWORD')
])

{
	sbPipeline(
	testUser:["TEST_USER" : "${env.USERNAME}","TEST_PASS" : "${env.PASSWORD}"],
	dbUser:["TEST_USER_DB" : "${env.DB_USERNAME}","TEST_PASS" : "${env.DB_PASSWORD}"]
	)

}



