package listener;



import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.CustomAttribute;
import org.testng.internal.annotations.ITest;

public class TestNGListeners extends TestListenerAdapter implements ITest{
	
	
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("***********Test started :" +result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("***********Test is successful:" +result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("***********Test is failure:" +result.getName());
	}
	
	
	public void onFinish(ITestContext context)
	{
		System.out.println("***********Test is completed" +context.getName());
	}


	public boolean getAlwaysRun() {
		// TODO Auto-generated method stub
		return false;
	}

	public CustomAttribute[] getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDataProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?> getDataProviderClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?>[] getExpectedExceptions() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getExpectedExceptionsMessageRegExp() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getInvocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	public IRetryAnalyzer getRetryAnalyzer() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getSingleThreaded() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getSuccessPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getSuiteName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getThreadPoolSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean ignoreMissingDependencies() {
		// TODO Auto-generated method stub
		return false;
	}

	public long invocationTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setAlwaysRun(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setAttributes(CustomAttribute[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setDataProvider(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setDataProviderClass(Class<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setExpectedExceptions(Class<?>[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setExpectedExceptionsMessageRegExp(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setIgnoreMissingDependencies(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setInvocationCount(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setInvocationTimeOut(long arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setPriority(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setRetryAnalyzer(Class<? extends IRetryAnalyzer> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSingleThreaded(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSkipFailedInvocations(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSuccessPercentage(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSuiteName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setTestName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setThreadPoolSize(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean skipFailedInvocations() {
		// TODO Auto-generated method stub
		return false;
	}

	public String[] getDependsOnGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getDependsOnMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDependsOnGroups(String[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setDependsOnMethods(String[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setGroups(String[] arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setTimeOut(long arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean getEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
