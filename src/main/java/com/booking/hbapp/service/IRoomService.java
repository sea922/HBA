package com.booking.hbapp.service;

import com.booking.hbapp.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;

    List<Room> getAllRooms();

    List<String> getAllRoomTypes();

    byte[] getRoomPhotoByRoomId(Long roomId) throws SQLException;
}
