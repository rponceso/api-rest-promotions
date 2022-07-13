package com.nttdata.apirestpromotions.events;

import com.nttdata.apirestpromotions.dto.CustomerDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerCreatedEvent extends Event<CustomerDto> {

}
