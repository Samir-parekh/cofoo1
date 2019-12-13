package cofoo.repos;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cofoo.entities.Otp;
import cofoo.entities.User;
import cofoo.enums.EntityStatus;

@Repository
public interface OtpRepo extends JpaRepository<Otp,Long> {

    public Optional<Otp> findByCodeAndUserAndExpiredAtAfterAndStatus(String code, User user, Date date, EntityStatus status);
}
