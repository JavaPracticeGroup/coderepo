package com.experiment.abhijit;

import com.experiment.packages.*;

import DataType.PrimitiveDataType;

public class AbhijitExperiment extends Experiment {

	public AbhijitExperiment() {
		super();
		System.out.println("...");
	}

	public void start() {
		DataTypeExperiment dt = new DataTypeExperiment();
		dt.start();
	}

}
