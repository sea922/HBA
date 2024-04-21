package com.booking.hbapp.service;

import com.booking.hbapp.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;

    List<Room> getAllRooms();

    List<String> getAllRoomTypes();

    void deleteRoom(Long roomId);

    Room updateRoom(Long roomId, String roomTye, BigDecimal roomPrice, byte[] photoBytes);

    byte[] getRoomPhotoByRoomId(Long roomId) throws SQLException;

    List<Room> getAvailableRooms(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    Optional<Room> getRoomById(Long roomId);
}
