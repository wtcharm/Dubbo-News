package cn.wt.dubbo.ssm.news.service.text;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wt.dubbo.ssm.news.service.INewsService;
import cn.wt.dubbo.ssm.news.vo.News;
import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:META-INF/spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class NewsServiceText {
		@Resource
		private INewsService newService;
		@Test
		public void testAdd() {
			 News vo = new News();
			 vo.setNote("你少");
			 vo.setTitle("每天都是如此");
			 vo.setPhoto("0000");
			 boolean flag = this.newService.add(vo);
			TestCase.assertTrue(flag);
			System.out.println(flag);
		}
}
