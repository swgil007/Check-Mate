package com.checkmate.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.checkmate.dao.GroupDAO;
import com.checkmate.vo.GroupPointVO;
import com.checkmate.vo.GroupVO;


@Service
public class GroupServiceImpl implements GroupService {

	@Inject
	private GroupDAO dao;

	@Override
	public void GroupCreate(GroupVO groupVO) throws Exception {
		dao.GroupCreate(groupVO);
	}

	@Override
	public List<GroupVO> GroupList(GroupVO groupVO) throws Exception {
		return dao.GroupList(groupVO);
	}

	@Override
	public int GroupListCount(GroupVO groupVO) throws Exception {
		return dao.GroupListCount(groupVO);
	}
	
	@Override
	public GroupVO findMaster(GroupVO groupVO) throws Exception {
		return dao.findMaster(groupVO);
	}

	@Override
	public void userPoint(GroupPointVO groupPointVO) throws Exception {
		dao.userPoint(groupPointVO);
	}

	@Override
	public List<GroupPointVO> findTopRankList(GroupVO groupVO) throws Exception {
		return dao.findTopRankList(groupVO);
	}

	@Override
	public GroupPointVO findMyRank(GroupVO groupVO) throws Exception {
		return dao.findMyRank(groupVO);
	}

	@Override
	public void socketConnection(GroupVO groupVO) throws Exception {
		dao.socketConnection(groupVO);
	}

	@Override
	public List<GroupVO> socketConnectionList(GroupVO groupVO) throws Exception {
		return dao.socketConnectionList(groupVO);
	}
}
