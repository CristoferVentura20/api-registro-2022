
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Cliente;
import com.apiregistro2022.repository.ClienteRepository;
import com.apiregistro2022.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public List<Cliente> findByName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente add(Cliente cl) {
        return clienteRepository.save(cl);
    }

    @Override
    public Cliente update(Cliente cl) {
        Cliente objecaCliente = clienteRepository.getById(cl.getCodigo());
        BeanUtils.copyProperties(cl, objecaCliente);
        return clienteRepository.save(objecaCliente);
    }

    @Override
    public Cliente delete(Cliente cl) {
        Cliente objecaCliente = clienteRepository.getById(cl.getCodigo());
        objecaCliente.setEstado(false);
        return clienteRepository.save(objecaCliente);
    }
    
}
