
package cn.sunline.edsp.busi.namedsql;

import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;

@cn.sunline.adp.core.annotation.Generated
public class AtNsqlDao {

	
	/**
	 * sql[添加用户]的fullId
	 *
	 */
	public static final String namedsql_insertUser = "AtNsql.insertUser";
	
	private static final IString insertUser_name =new IString("AtNsql.insertUser.longname","添加用户");
   /**
	 * 添加用户
	 *
	 * <p>
	 *
	 *
 	 * @return rowNum 影响的行数
 	 *
	 * @exception cn.sunline.adp.core.exception.AdpDaoLockException [] Failed!Lock timeouts!
	 */
	public static int insertUser(cn.sunline.edsp.busi.tables.AtTable.user_table entity )throws cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException {
		try {
			return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insert(namedsql_insertUser, entity);		
		} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
			throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString(InternationalConstantDef.SPC_IN.C012,new Params().add("tableName", insertUser_name)), e1);
		} catch (cn.sunline.adp.core.exception.AdpDaoLockException e4) {
			throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C015,new Params().add("tableName", insertUser_name)), e4);
		}catch (cn.sunline.adp.core.exception.AdpDaoException e5) {
			throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C016,new Params().add("tableName", insertUser_name)), e5);
		}
	}
	
}