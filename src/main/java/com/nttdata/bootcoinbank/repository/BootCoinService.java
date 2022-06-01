package com.nttdata.bootcoinbank.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcoinbank.model.BootCoin;
import com.nttdata.bootcoinbank.repository.IBootService;

@Service
public abstract class BootCoinService extends BaseService<BootCoin, String> implements IBootService {
    private final IBootCoin bootCoinRepository;

    @Autowired
    public BootCoinService(IBootCoin bootCoinRepository) {
        this.bootCoinRepository = bootCoinRepository;
    }

    @Override
    protected IRepository getRepository() {
        return (IRepository) bootCoinRepository;
    }


}