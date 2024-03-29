package com.knucapstone.rudoori.model.dto.ChatRooms;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoomResponse {

    private String _id;
    private String roomName;
    private String introduce;
    private List<String> participants;
    private int maxParticipants;
    private List<String> blockedMember;
    private LocalDateTime createdAt;
    private boolean isFull;
}
