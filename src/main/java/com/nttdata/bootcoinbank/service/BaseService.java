package com.nttdata.bootcoinbank.service;

import java.util.function.Function;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.ReactiveFluentQuery;
import org.springframework.stereotype.Service;

import com.nttdata.bootcoinbank.model.BootCoin;
import com.nttdata.bootcoinbank.repository.IBootCoin;
import com.nttdata.bootcoinbank.repository.IRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BaseService implements IBootCoin {

	@Autowired
    protected IBootCoin repository;

	@Override
	public <S extends BootCoin> Mono<S> insert(S entity) {
		return null;
	}

	@Override
	public <S extends BootCoin> Flux<S> insert(Iterable<S> entities) {
		return repository.insert(entities);
	}

	@Override
	public <S extends BootCoin> Flux<S> insert(Publisher<S> entities) {
		return repository.insert(entities);
	}

	@Override
	public <S extends BootCoin> Flux<S> findAll(Example<S> example) {
		return repository.findAll(example);
	}

	@Override
	public <S extends BootCoin> Flux<S> findAll(Example<S> example, Sort sort) {
		return repository.findAll(example, sort);
	}

	@Override
	public Flux<BootCoin> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	@Override
	public <S extends BootCoin> Mono<S> save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BootCoin> Flux<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BootCoin> Flux<S> saveAll(Publisher<S> entityStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<BootCoin> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<BootCoin> findById(Publisher<String> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> existsById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> existsById(Publisher<String> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<BootCoin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<BootCoin> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<BootCoin> findAllById(Publisher<String> idStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Long> count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(Publisher<String> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(BootCoin entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll(Iterable<? extends BootCoin> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll(Publisher<? extends BootCoin> entityStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BootCoin> Mono<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BootCoin> Mono<Long> count(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BootCoin> Mono<Boolean> exists(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BootCoin, R, P extends Publisher<R>> P findBy(Example<S> example,
			Function<ReactiveFluentQuery<S>, P> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}


}
