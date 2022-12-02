package ru.vlapin.experiments.lottery.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.lottery.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
