package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.SeatDao;
import com.movie.vo.SeatVo;

@Service
public class SeatServiceImpl implements SeatService{
	@Autowired
	SeatDao seatDao;

	@Override
	public List<SeatVo> getSeletedSeat(Long schedule_id) {
		return seatDao.getSeletedSeat(schedule_id);
	}

	@Override
	public int insertSeat(Long schedule_id, String seat_name) {
		return seatDao.insertSeat(schedule_id, seat_name);
	}

	@Override
	public List<Long> getSeatIdBySchedule(Long schedule_id) {
		return seatDao.getSeatIdBySchedule(schedule_id);
	}

	@Override
	public int deleteSeat(Long seat_id) {
		return seatDao.deleteSeat(seat_id);
	}

	@Override
	public SeatVo getSeatInfoById(Long seat_id) {
		return seatDao.getSeatInfoById(seat_id);
	}

	@Override
	public int deleteSeatBySchedule(Long schedule_id) {
		return seatDao.deleteSeatBySchedule(schedule_id);
	}
	
	
}