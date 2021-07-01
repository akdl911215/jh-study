package org.zerock.guestbook.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.guestbook.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
