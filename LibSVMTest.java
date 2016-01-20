import java.io.IOException;

import libsvm.*;

public class LibSVMTest {

	/**JAVA test code for LibSVM
	 * @author yangliu
	 * @throws IOException 
	 * @blog http://blog.csdn.net/yangliuy
	 * @mail yang.liu@pku.edu.cn
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Test for svm_train and svm_predict
		//svm_train: 
		//	  param: String[], parse result of command line parameter of svm-train
		//    return: String, the directory of modelFile
		//svm_predect:
		//	  param: String[], parse result of command line parameter of svm-predict, including the modelfile
		//    return: Double, the accuracy of SVM classification
		/*
		String[] trainArgs = {"24.txt","model.txt"};//directory of training file
		//String modelFile = svm_train.main(trainArgs);
		String[] testArgs = {"24.txt", "model.txt", "out.txt"};//directory of test file, model file, result file
		svm_train t = new svm_train();
		svm_predict p = new svm_predict();
		t.main(trainArgs);
		p.main(testArgs);
		*/
		//Double accuracy = svm_predict.main(testArgs);
		//System.out.println("SVM Classification is done! The accuracy is " + accuracy);

		
		String[] trainArgs = {"29.txt"};//directory of training file
		String modelFile = svm_train.main(trainArgs);
		String[] testArgs = {"27.txt", modelFile, "result.txt"};//directory of test file, model file, result file
		Double accuracy = svm_predict.main(testArgs);
		System.out.println("SVM Classification is done! The accuracy is " + accuracy);
		
		//System.out.println("SVM Classification is done! ");
		//Test for cross validation
		//String[] crossValidationTrainArgs = {"-v", "10", "UCI-breast-cancer-tra"};// 10 fold cross validation
		//modelFile = svm_train.main(crossValidationTrainArgs);
		//System.out.print("Cross validation is done! The modelFile is " + modelFile);
	}

}
