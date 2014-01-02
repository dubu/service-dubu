package mybatis.mem;

/**
 * User: dubu
 * Date: 13. 12. 30
 * Time: 오전 11:25
 */

import com.dubu.model.Category;

import java.util.List;
public interface CategoryMapper {

  List<Category> getCategoryList();

  Category getCategory(String categoryId);

}
