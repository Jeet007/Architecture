package com.jeet.example.services;

import com.jeet.example.models.User;
import com.jeet.example.to.UserTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SampleService {
    @Autowired
    private ModelMapper mapper;

    // @Transactional(propagation = REQUIRES_NEW)
    public UserTO getUser(String firstName, String lastName) {
        //User user = sampleRepository.findByFirstNameAndLastName(firstName, lastName);
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return mapper.map(user, UserTO.class);
    }
}
