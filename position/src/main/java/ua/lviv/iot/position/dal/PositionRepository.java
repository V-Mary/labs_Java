package ua.lviv.iot.positionproject.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.positionproject.models.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {

}
