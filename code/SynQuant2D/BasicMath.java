import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.apache.commons.math3.special.Erf;

//Yinxue's basic math
public class BasicMath {
	public double vectorSum(double[] curveA){
		double sumVal = 0;
		for(int k=0; k<curveA.length; k++){
			sumVal += curveA[k];
		}
		return sumVal;
	}
	
	public double vectorMax(double[] curveA){
		double maxVal = curveA[0];
		for(int k=1; k<curveA.length; k++){
			if(curveA[k] > maxVal) maxVal = curveA[k];
		}
		return maxVal;
	}
	
	public double matrix2DMax(double[][] matA){
		double maxVal = matA[0][0];
		for(int i=0; i<matA.length; i++){
			for(int j=0; j<matA[0].length; j++){
				if(matA[i][j] > maxVal) maxVal = matA[i][j];
			}
		}
		return maxVal;
	}
	
	public double vectorMin(double[] curveA){
		double minVal = curveA[0];
		for(int k=1; k<curveA.length; k++){
			if(curveA[k] < minVal) minVal = curveA[k];
		}
		return minVal;
	}
	
	public double matrix2DMin(double[][] matA){
		double minVal = matA[0][0];
		for(int i=0; i<matA.length; i++){
			for(int j=0; j<matA[0].length; j++){
				if(matA[i][j] < minVal) minVal = matA[i][j];
			}
		}
		return minVal;
	}
	
	
	public double sampleMean(double[] curveA){
		double meanVal = 0;
		for(int k=0; k<curveA.length; k++){
			meanVal += curveA[k];
		}
		meanVal /= curveA.length;
		return meanVal;
	}
	
	public double sampleVar(double[] curveA){
		double meanVal = 0;
		for(int k=0; k<curveA.length; k++){
			meanVal += curveA[k];
		}
		meanVal /= curveA.length;
		
		double smpVarVal = 0;
		for(int k=0; k<curveA.length; k++){
			smpVarVal += (curveA[k] - meanVal)*(curveA[k] - meanVal);
		}
		smpVarVal /= (curveA.length-1);
		
		return smpVarVal;
	}
	
	public double sampleVar(double[] curveA, double meanVal){
		double smpVarVal = 0;
		for(int k=0; k<curveA.length; k++){
			smpVarVal += (curveA[k] - meanVal)*(curveA[k] - meanVal);
		}
		smpVarVal /= (curveA.length-1);
		
		return smpVarVal;
	}
	//Congchao's basic math
	//for integer
	public int vectorSum(int[] curveA){
		int sumVal = 0;
		for(int k=0; k<curveA.length; k++){
			sumVal += curveA[k];
		}
		return sumVal;
	}
	
	public int vectorMax(int[] curveA){
		int maxVal = curveA[0];
		for(int k=1; k<curveA.length; k++){
			if(curveA[k] > maxVal) maxVal = curveA[k];
		}
		return maxVal;
	}
	
	public int matrix2DMax(int[][] matA){
		int maxVal = matA[0][0];
		for(int i=0; i<matA.length; i++){
			for(int j=0; j<matA[0].length; j++){
				if(matA[i][j] > maxVal) maxVal = matA[i][j];
			}
		}
		return maxVal;
	}
	
	public int vectorMin(int[] curveA){
		int minVal = curveA[0];
		for(int k=1; k<curveA.length; k++){
			if(curveA[k] < minVal) minVal = curveA[k];
		}
		return minVal;
	}
	
	public int matrix2DMin(int[][] matA){
		int minVal = matA[0][0];
		for(int i=0; i<matA.length; i++){
			for(int j=0; j<matA[0].length; j++){
				if(matA[i][j] < minVal) minVal = matA[i][j];
			}
		}
		return minVal;
	}
	public double pToZ(double p) {// pvalue to zscore
	    double z = Math.sqrt(2) * Erf.erfcInv(2*p);
	    return z;
	}
	public double zTop(double z) {// zscore to pvalue
	    double p = 0.5 * Erf.erfc(z/Math.sqrt(2));
	    return p;
	}
	public int [] unique(int[] vec){
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		// add elements to c
		c.add(vec[0]);
		for(int i=0;i<vec.length;i++){
			boolean addflag = true;
			for(int j=0;j<c.size();j++){
				if(c.get(j)==vec[i]){
					addflag = false;
					break;
				}
			}
			if(addflag)
				c.add(vec[i]);
		}

		int[] out_vec = new int [c.size()];
		for(int i=0;i<c.size();i++)
			out_vec[i] =out_vec[i];
			
		return out_vec;
	}
	public boolean Allfalse(boolean[][] kMap0) {
		// TODO Auto-generated method stub
		for(int i=0;i<kMap0.length;i++)
			for(int j=0;j<kMap0[0].length;j++)
				if(kMap0[i][j])
					return false;
		return true;
	}
}
