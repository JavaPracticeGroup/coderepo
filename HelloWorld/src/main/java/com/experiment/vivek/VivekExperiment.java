package com.experiment.vivek;
import com.experiment.packages.Experiment;

import DataType.PrimitiveDataType;
import DataType.TypeCasting;

public class VivekExperiment extends Experiment{
	
	public VivekExperiment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void start() {
		System.out.println("...");
     	PrimitiveDataType pDt = new PrimitiveDataType();
		pDt.showBoolean();
//		TypeCasting tc = new TypeCasting();
//		tc.byteToShort();
	}

}
