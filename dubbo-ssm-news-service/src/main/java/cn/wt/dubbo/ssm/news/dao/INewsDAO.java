package cn.wt.dubbo.ssm.news.dao;

import cn.wt.dubbo.ssm.news.vo.News;

public interface INewsDAO {
	/**
	 * 主要是实现新闻的增加
	 * @param vo 要增加的信息
 	 * @return 增加成功返回true否则返回false
	 */
	public boolean doCreate(News vo);
}
