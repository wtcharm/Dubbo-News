package cn.wt.dubbo.ssm.news.service.impl.back;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wt.dubbo.ssm.news.dao.INewsDAO;
import cn.wt.dubbo.ssm.news.service.INewsService;
import cn.wt.dubbo.ssm.news.vo.News;
@Service
public class NewsServiceImplBack implements INewsService {
	@Resource
	private INewsDAO newsdao; 
	@Override
	public boolean add(News vo) {
		if("".equals(vo)) {
			return false;
		}
		return newsdao.doCreate(vo);
	}

}
