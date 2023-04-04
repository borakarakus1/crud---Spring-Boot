package com.bora.crud.shared;
import com.bora.crud.utility.ExceptionMessage;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Response{
        private ExceptionMessage exception ;
        private LocalDateTime occuredTime;

        public Response(ExceptionMessage exception, LocalDateTime occuredTime) {
                this.exception = exception;
                this.occuredTime = occuredTime;
        }

}


