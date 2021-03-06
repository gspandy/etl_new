package com.zbiti.etl.extend.executer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbiti.etl.core.executer.ICommandExecuter;
import com.zbiti.etl.core.executer.ICommandExecuterFactory;
import com.zbiti.etl.core.smo.IResourceService;
import com.zbiti.etl.core.smo.IStepService;

/**
 * 
 * @author 严海平
 *
 */
@Service("shellStepExecuterFactory")
public class ShellStepExecuterFactory implements ICommandExecuterFactory<Boolean>{

	@Autowired(required=true)
	IStepService stepService;
	@Autowired(required=true)
	IResourceService resourceService;
	
	@Override
	public ICommandExecuter<Boolean> createExecuter() {
		ShellStepExecuter s=new ShellStepExecuter();
		s.setStepService(stepService);
		s.setResourceService(resourceService);
		return s;
	}

}
