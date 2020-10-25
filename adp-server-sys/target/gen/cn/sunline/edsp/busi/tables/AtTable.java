
package cn.sunline.edsp.busi.tables;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * Account table structure
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface AtTable {
	 /**
	  * Customer information form
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtTable.kapp_cust", longname="Customer information form" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface kapp_cust {
			/**
			  * 
			  *
			  **/	 
			public static class odb1 extends cn.sunline.adp.metadata.model.annotation.Index.PrimaryKey {};
			/**
			  * 
			  *
			  **/	 
			public static class odb2 implements cn.sunline.adp.metadata.model.annotation.Index.Name {};
 	
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
		
	 /**
	  * Customer name
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer name")
		public String getCustna();
	 /**
	  * Customer name
	  */
		public void setCustna(String custna);
		
	 /**
	  * Telephone number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Telephone number")
		public String getTeleno();
	 /**
	  * Telephone number
	  */
		public void setTeleno(String teleno);
		
	 /**
	  * 住址
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="住址")
		public String getAddress();
	 /**
	  * 住址
	  */
		public void setAddress(String address);
		
	 /**
	  * 证件类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件类型")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE getCertype();
	 /**
	  * 证件类型
	  */
		public void setCertype(cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE certype);
		
	 /**
	  * 证件号
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件号")
		public String getCertno();
	 /**
	  * 证件号
	  */
		public void setCertno(String certno);
		
		public String toString();
	

		}
	
	/**
	  *	kapp_cust--Customer information form
	  */
	public static class Kapp_custDao {
		private static final IString kapp_cust_table_name=new IString("AtTable.kapp_cust.longname","Customer information form");
		/**
		  * add　Customer information form
		  * @param entity table entity object
		  * @return number of records affected
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_cust(custno, custna, teleno, address, certype, certno) values (#custno#, #custna#, #teleno#, #address#, #certype#, #certno#)")
		public static int insert(cn.sunline.edsp.busi.tables.AtTable.kapp_cust entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insert(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString (InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_cust_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
                throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_cust_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_cust_table_name)), e3);
			}
		}
		/**
		  * add　Customer information form
		  * @param entity table entity object
		  * @return id insert record id
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_cust(custno, custna, teleno, address, certype, certno) values (#custno#, #custna#, #teleno#, #address#, #certype#, #certno#)")
		public static int insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_cust entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString(InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_cust_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_cust_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_cust_table_name)), e3);
			}
		}
	   /**
	    *	
	    * @param custno Customer number 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Customer information form
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select custno, custna, teleno, address, certype, certno from kapp_cust where custno=#custno#")
		public static cn.sunline.edsp.busi.tables.AtTable.kapp_cust selectOne_odb1(String custno, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custno", custno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb1.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cust_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C018,new Params().add("tableName", kapp_cust_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custno Customer number 
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="delete from kapp_cust where custno=#custno#")
		public static int deleteOne_odb1(String custno) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custno", custno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.deleteOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb1.class, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C017,new Params().add("tableName", kapp_cust_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C020,new Params().add("tableName", kapp_cust_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C006,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C002,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param entity Customer information form
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="update kapp_cust set custna=#custna#,teleno=#teleno#,address=#address#,certype=#certype#,certno=#certno# where custno=#custno#")
		public static int updateOne_odb1(cn.sunline.edsp.busi.tables.AtTable.kapp_cust entity) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.updateOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb1.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C009,new Params().add("tableName", kapp_cust_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C019,new Params().add("tableName", kapp_cust_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C007,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C003,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custno Customer number 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Customer information form
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select custno, custna, teleno, address, certype, certno from kapp_cust where custno=#custno#")
		public static cn.sunline.edsp.busi.tables.AtTable.kapp_cust selectOneWithLock_odb1(String custno, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custno", custno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectOneWithLockByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb1.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cust_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C018,new Params().add("tableName", kapp_cust_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custna Customer name 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Customer information form
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select custno, custna, teleno, address, certype, certno from kapp_cust where custna=#custna#")
		public static cn.sunline.edsp.busi.tables.AtTable.kapp_cust selectFirst_odb2(String custna, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custna", custna);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectFirstByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb2.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cust_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custna Customer name 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Customer information form　collection
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select custno, custna, teleno, address, certype, certno from kapp_cust where custna=#custna#")
		public static java.util.List<cn.sunline.edsp.busi.tables.AtTable.kapp_cust> selectAll_odb2(String custna, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custna", custna);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectAllByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb2.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cust_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custna Customer name 
		* @param start start recording subscript
		* @param count number of queries
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Customer information form　collection
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select custno, custna, teleno, address, certype, certno from kapp_cust where custna=#custna#")
		public static java.util.List<cn.sunline.edsp.busi.tables.AtTable.kapp_cust> selectPage_odb2(String custna , long start, long count
, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custna", custna);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectPageByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb2.class, (int)start, (int)count, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cust_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param entity Customer information form
		* @return Query result, number of records affected
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="update kapp_cust set custno=#custno#,teleno=#teleno#,address=#address#,certype=#certype#,certno=#certno# where custna=#custna#")
		public static int update_odb2(cn.sunline.edsp.busi.tables.AtTable.kapp_cust entity) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.updateByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb2.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C009,new Params().add("tableName", kapp_cust_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C007,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C003,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custna Customer name 
		* @return Query result, number of records affected
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="delete from kapp_cust where custna=#custna#")
		public static int delete_odb2(String custna) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custna", custna);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.deleteByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb2.class, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C017,new Params().add("tableName", kapp_cust_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C006,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C002,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custna Customer name 
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select custno, custna, teleno, address, certype, certno from kapp_cust where custna=#custna#")
		public static void selectCursor_odb2(String custna ,cn.sunline.adp.metadata.base.dao.CursorHandler<cn.sunline.edsp.busi.tables.AtTable.kapp_cust> handler) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custna", custna);
			try {
				 cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectCursorByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb2.class , handler
, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cust_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param custna Customer name 
		* @param start start recording subscript
		* @param count number of queries
		* @param totlcount total records
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Customer information form　collection
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select custno, custna, teleno, address, certype, certno from kapp_cust where custna=#custna#")
		public static cn.sunline.edsp.base.lang.Page<cn.sunline.edsp.busi.tables.AtTable.kapp_cust> selectPageWithCount_odb2(String custna , long start, long count,long totlCount
, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("custna", custna);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectPageWithCountByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cust.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cust.odb2.class, (int)start, (int)count,(int)totlCount, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cust_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cust_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cust_table_name)), e4);
			}
		}
		
	}
	 /**
	  * Account information form
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtTable.kapp_acct", longname="Account information form" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface kapp_acct {
			/**
			  * 
			  *
			  **/	 
			public static class odb1 extends cn.sunline.adp.metadata.model.annotation.Index.PrimaryKey {};
 	
	 /**
	  * Account number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account number")
		public String getAcctno();
	 /**
	  * Account number
	  */
		public void setAcctno(String acctno);
		
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
		
	 /**
	  * Account Status
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account Status")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST getAcctst();
	 /**
	  * Account Status
	  */
		public void setAcctst(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST acctst);
		
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
		
	 /**
	  * 账户额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户额度")
		public java.math.BigDecimal getAccquota();
	 /**
	  * 账户额度
	  */
		public void setAccquota(java.math.BigDecimal accquota);
		
	 /**
	  * 账户余额
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户余额")
		public java.math.BigDecimal getBalance();
	 /**
	  * 账户余额
	  */
		public void setBalance(java.math.BigDecimal balance);
		
		public String toString();
	

		}
	
	/**
	  *	kapp_acct--Account information form
	  */
	public static class Kapp_acctDao {
		private static final IString kapp_acct_table_name=new IString("AtTable.kapp_acct.longname","Account information form");
		/**
		  * add　Account information form
		  * @param entity table entity object
		  * @return number of records affected
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_acct(acctno, cardno, acctst, custno, accquota, balance) values (#acctno#, #cardno#, #acctst#, #custno#, #accquota#, #balance#)")
		public static int insert(cn.sunline.edsp.busi.tables.AtTable.kapp_acct entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insert(cn.sunline.edsp.busi.tables.AtTable.kapp_acct.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString (InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_acct_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
                throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_acct_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_acct_table_name)), e3);
			}
		}
		/**
		  * add　Account information form
		  * @param entity table entity object
		  * @return id insert record id
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_acct(acctno, cardno, acctst, custno, accquota, balance) values (#acctno#, #cardno#, #acctst#, #custno#, #accquota#, #balance#)")
		public static int insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_acct entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_acct.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString(InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_acct_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_acct_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_acct_table_name)), e3);
			}
		}
	   /**
	    *	
	    * @param cardno Card number 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Account information form
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select acctno, cardno, acctst, custno, accquota, balance from kapp_acct where cardno=#cardno#")
		public static cn.sunline.edsp.busi.tables.AtTable.kapp_acct selectOne_odb1(String cardno, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("cardno", cardno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_acct.class, cn.sunline.edsp.busi.tables.AtTable.kapp_acct.odb1.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_acct_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C018,new Params().add("tableName", kapp_acct_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_acct_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_acct_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param cardno Card number 
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="delete from kapp_acct where cardno=#cardno#")
		public static int deleteOne_odb1(String cardno) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("cardno", cardno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.deleteOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_acct.class, cn.sunline.edsp.busi.tables.AtTable.kapp_acct.odb1.class, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C017,new Params().add("tableName", kapp_acct_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C020,new Params().add("tableName", kapp_acct_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C006,new Params().add("tableName", kapp_acct_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C002,new Params().add("tableName", kapp_acct_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param entity Account information form
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="update kapp_acct set acctno=#acctno#,acctst=#acctst#,custno=#custno#,accquota=#accquota#,balance=#balance# where cardno=#cardno#")
		public static int updateOne_odb1(cn.sunline.edsp.busi.tables.AtTable.kapp_acct entity) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.updateOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_acct.class, cn.sunline.edsp.busi.tables.AtTable.kapp_acct.odb1.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C009,new Params().add("tableName", kapp_acct_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C019,new Params().add("tableName", kapp_acct_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C007,new Params().add("tableName", kapp_acct_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C003,new Params().add("tableName", kapp_acct_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param cardno Card number 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,Account information form
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select acctno, cardno, acctst, custno, accquota, balance from kapp_acct where cardno=#cardno#")
		public static cn.sunline.edsp.busi.tables.AtTable.kapp_acct selectOneWithLock_odb1(String cardno, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("cardno", cardno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectOneWithLockByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_acct.class, cn.sunline.edsp.busi.tables.AtTable.kapp_acct.odb1.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_acct_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C018,new Params().add("tableName", kapp_acct_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_acct_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_acct_table_name)), e4);
			}
		}
		
	}
	 /**
	  * 卡信息表
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtTable.kapp_card", longname="卡信息表" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface kapp_card {
			/**
			  * 
			  *
			  **/	 
			public static class odb1 extends cn.sunline.adp.metadata.model.annotation.Index.PrimaryKey {};
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
		
	 /**
	  * Account Status
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account Status")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST getAcctst();
	 /**
	  * Account Status
	  */
		public void setAcctst(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST acctst);
		
	 /**
	  * 开卡时间
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="开卡时间")
		public java.sql.Timestamp getOpencartime();
	 /**
	  * 开卡时间
	  */
		public void setOpencartime(java.sql.Timestamp opencartime);
		
	 /**
	  * 卡有效期
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="卡有效期")
		public java.sql.Timestamp getValidtime();
	 /**
	  * 卡有效期
	  */
		public void setValidtime(java.sql.Timestamp validtime);
		
		public String toString();
	

		}
	
	/**
	  *	kapp_card--卡信息表
	  */
	public static class Kapp_cardDao {
		private static final IString kapp_card_table_name=new IString("AtTable.kapp_card.longname","卡信息表");
		/**
		  * add　卡信息表
		  * @param entity table entity object
		  * @return number of records affected
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_card(cardno, acctst, opencartime, validtime) values (#cardno#, #acctst#, #opencartime#, #validtime#)")
		public static int insert(cn.sunline.edsp.busi.tables.AtTable.kapp_card entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insert(cn.sunline.edsp.busi.tables.AtTable.kapp_card.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString (InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_card_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
                throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_card_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_card_table_name)), e3);
			}
		}
		/**
		  * add　卡信息表
		  * @param entity table entity object
		  * @return id insert record id
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_card(cardno, acctst, opencartime, validtime) values (#cardno#, #acctst#, #opencartime#, #validtime#)")
		public static int insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_card entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_card.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString(InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_card_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_card_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_card_table_name)), e3);
			}
		}
	   /**
	    *	
	    * @param cardno Card number 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,卡信息表
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select cardno, acctst, opencartime, validtime from kapp_card where cardno=#cardno#")
		public static cn.sunline.edsp.busi.tables.AtTable.kapp_card selectOne_odb1(String cardno, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("cardno", cardno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_card.class, cn.sunline.edsp.busi.tables.AtTable.kapp_card.odb1.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_card_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C018,new Params().add("tableName", kapp_card_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_card_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_card_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param cardno Card number 
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="delete from kapp_card where cardno=#cardno#")
		public static int deleteOne_odb1(String cardno) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("cardno", cardno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.deleteOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_card.class, cn.sunline.edsp.busi.tables.AtTable.kapp_card.odb1.class, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C017,new Params().add("tableName", kapp_card_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C020,new Params().add("tableName", kapp_card_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C006,new Params().add("tableName", kapp_card_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C002,new Params().add("tableName", kapp_card_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param entity 卡信息表
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="update kapp_card set acctst=#acctst#,opencartime=#opencartime#,validtime=#validtime# where cardno=#cardno#")
		public static int updateOne_odb1(cn.sunline.edsp.busi.tables.AtTable.kapp_card entity) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.updateOneByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_card.class, cn.sunline.edsp.busi.tables.AtTable.kapp_card.odb1.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C009,new Params().add("tableName", kapp_card_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C019,new Params().add("tableName", kapp_card_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C007,new Params().add("tableName", kapp_card_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C003,new Params().add("tableName", kapp_card_table_name)), e4);
			}
		}
		
	}
	 /**
	  * 消费流水记录表
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtTable.kapp_cum_serial", longname="消费流水记录表" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface kapp_cum_serial {
			/**
			  * 
			  *
			  **/	 
			public static class odb1 implements cn.sunline.adp.metadata.model.annotation.Index.Name {};
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
		
	 /**
	  * Trading serial number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Trading serial number")
		public String getTranno();
	 /**
	  * Trading serial number
	  */
		public void setTranno(String tranno);
		
	 /**
	  * 账户额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户额度")
		public java.math.BigDecimal getAccquota();
	 /**
	  * 账户额度
	  */
		public void setAccquota(java.math.BigDecimal accquota);
		
	 /**
	  * 账户余额
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户余额")
		public java.math.BigDecimal getBalance();
	 /**
	  * 账户余额
	  */
		public void setBalance(java.math.BigDecimal balance);
		
	 /**
	  * 消费金额
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费金额")
		public java.math.BigDecimal getAmount();
	 /**
	  * 消费金额
	  */
		public void setAmount(java.math.BigDecimal amount);
		
	 /**
	  * 消费说明
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费说明")
		public String getDescription();
	 /**
	  * 消费说明
	  */
		public void setDescription(String description);
		
	 /**
	  * 剩余额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="剩余额度")
		public java.math.BigDecimal getRemain();
	 /**
	  * 剩余额度
	  */
		public void setRemain(java.math.BigDecimal remain);
		
	 /**
	  * 消费时间
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费时间")
		public java.sql.Timestamp getCumtime();
	 /**
	  * 消费时间
	  */
		public void setCumtime(java.sql.Timestamp cumtime);
		
		public String toString();
	

		}
	
	/**
	  *	kapp_cum_serial--消费流水记录表
	  */
	public static class Kapp_cum_serialDao {
		private static final IString kapp_cum_serial_table_name=new IString("AtTable.kapp_cum_serial.longname","消费流水记录表");
		/**
		  * add　消费流水记录表
		  * @param entity table entity object
		  * @return number of records affected
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_cum_serial(cardno, tranno, accquota, balance, amount, description, remain, cumtime) values (#cardno#, #tranno#, #accquota#, #balance#, #amount#, #description#, #remain#, #cumtime#)")
		public static int insert(cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insert(cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString (InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_cum_serial_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
                throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_cum_serial_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_cum_serial_table_name)), e3);
			}
		}
		/**
		  * add　消费流水记录表
		  * @param entity table entity object
		  * @return id insert record id
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into kapp_cum_serial(cardno, tranno, accquota, balance, amount, description, remain, cumtime) values (#cardno#, #tranno#, #accquota#, #balance#, #amount#, #description#, #remain#, #cumtime#)")
		public static int insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString(InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", kapp_cum_serial_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", kapp_cum_serial_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", kapp_cum_serial_table_name)), e3);
			}
		}
	   /**
	    *	
	    * @param cardno Card number 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,消费流水记录表　collection
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select cardno, tranno, accquota, balance, amount, description, remain, cumtime from kapp_cum_serial where cardno=#cardno#")
		public static java.util.List<cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial> selectAll_odb1(String cardno, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("cardno", cardno);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectAllByIndex(cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial.class, cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial.odb1.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", kapp_cum_serial_table_name)), e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", kapp_cum_serial_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", kapp_cum_serial_table_name)), e4);
			}
		}
		
	}
	 /**
	  * 用户信息表
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtTable.user_table", longname="用户信息表" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface user_table {
			/**
			  * 
			  *
			  **/	 
			public static class selectOne extends cn.sunline.adp.metadata.model.annotation.Index.PrimaryKey {};
			/**
			  * 
			  *
			  **/	 
			public static class deleteOne extends cn.sunline.adp.metadata.model.annotation.Index.PrimaryKey {};
			/**
			  * 
			  *
			  **/	 
			public static class updeleteOne extends cn.sunline.adp.metadata.model.annotation.Index.PrimaryKey {};
 	
	 /**
	  * userID
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userID")
		public String getUserid();
	 /**
	  * userID
	  */
		public void setUserid(String userid);
		
	 /**
	  * userName
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userName")
		public String getUserName();
	 /**
	  * userName
	  */
		public void setUserName(String userName);
		
	 /**
	  * userAge
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userAge")
		public String getUserAge();
	 /**
	  * userAge
	  */
		public void setUserAge(String userAge);
		
		public String toString();
	

		}
	
	/**
	  *	user_table--用户信息表
	  */
	public static class User_tableDao {
		private static final IString user_table_table_name=new IString("AtTable.user_table.longname","用户信息表");
		/**
		  * add　用户信息表
		  * @param entity table entity object
		  * @return number of records affected
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into user_table(userid, userName, userAge) values (#userid#, #userName#, #userAge#)")
		public static int insert(cn.sunline.edsp.busi.tables.AtTable.user_table entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insert(cn.sunline.edsp.busi.tables.AtTable.user_table.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString (InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", user_table_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
                throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", user_table_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", user_table_table_name)), e3);
			}
		}
		/**
		  * add　用户信息表
		  * @param entity table entity object
		  * @return id insert record id
		  * @exception AdpDaoDuplicateException duplicate key exception
		  * @exception AdpDaoLockException lock wait timeout
		  * @exception AdpDaoException general exception for database operations,scilicet　SQLException
		  */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="insert into user_table(userid, userName, userAge) values (#userid#, #userName#, #userAge#)")
		public static int insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.user_table entity) throws cn.sunline.adp.core.exception.AdpDaoException, cn.sunline.adp.core.exception.AdpDaoDuplicateException , cn.sunline.adp.core.exception.AdpDaoLockException{
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.insertWithReturnKey(cn.sunline.edsp.busi.tables.AtTable.user_table.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoDuplicateException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoDuplicateException(new IString(InternationalConstantDef.SPC_IN.C011,new Params().add("tableName", user_table_table_name)),e1);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C005,new Params().add("tableName", user_table_table_name)) ,e2);
            } catch (cn.sunline.adp.core.exception.AdpDaoException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C001,new Params().add("tableName", user_table_table_name)), e3);
			}
		}
	   /**
	    *	
	    * @param userid userID 
		* @param nullException Whether to throw when there is no record　LTTSDaoNoDataFoundExceptionexception，true　means throw an exception，false　means not throwing an exception
		* @return query result,用户信息表
		* @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
		* @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="select userid, userName, userAge from user_table where userid=#userid#")
		public static cn.sunline.edsp.busi.tables.AtTable.user_table selectOne_selectOne(String userid, boolean nullException) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("userid", userid);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.selectOneByIndex(cn.sunline.edsp.busi.tables.AtTable.user_table.class, cn.sunline.edsp.busi.tables.AtTable.user_table.selectOne.class, nullException, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C010,new Params().add("tableName", user_table_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C018,new Params().add("tableName", user_table_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C008,new Params().add("tableName", user_table_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C004,new Params().add("tableName", user_table_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param userid userID 
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="delete from user_table where userid=#userid#")
		public static int deleteOne_deleteOne(String userid) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			cn.sunline.edsp.base.lang.Params parms = new cn.sunline.edsp.base.lang.Params().add("userid", userid);
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.deleteOneByIndex(cn.sunline.edsp.busi.tables.AtTable.user_table.class, cn.sunline.edsp.busi.tables.AtTable.user_table.deleteOne.class, parms);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C017,new Params().add("tableName", user_table_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C020,new Params().add("tableName", user_table_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C006,new Params().add("tableName", user_table_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C002,new Params().add("tableName", user_table_table_name)), e4);
			}
		}
	   /**
	    *	
	    * @param entity 用户信息表
		* @return Query result, number of records affected
	    * @exception cn.sunline.adp.core.exception.AdpDaoNoDataFoundException [] Failed! Can't find the corresponding record.
	    * @exception cn.sunline.adp.core.exception.AdpDaoTooManyRowsException [] Failed! The records is more than one.
		* @exception AdpDaoLockException [] Failed!Lock timeouts!
	    */
		@cn.sunline.adp.metadata.model.annotation.Statement(sql="update user_table set userName=#userName#,userAge=#userAge# where userid=#userid#")
		public static int updateOne_updeleteOne(cn.sunline.edsp.busi.tables.AtTable.user_table entity) 
					throws cn.sunline.adp.core.exception.AdpDaoNoDataFoundException,cn.sunline.adp.core.exception.AdpDaoLockException, cn.sunline.adp.core.exception.AdpDaoTooManyRowsException {
			try {
				return cn.sunline.adp.metadata.loader.db.util.DaoUtil.updateOneByIndex(cn.sunline.edsp.busi.tables.AtTable.user_table.class, cn.sunline.edsp.busi.tables.AtTable.user_table.updeleteOne.class, entity);
			} catch (cn.sunline.adp.core.exception.AdpDaoNoDataFoundException e1) {
				throw new cn.sunline.adp.core.exception.AdpDaoNoDataFoundException(new IString(InternationalConstantDef.SPC_IN.C009,new Params().add("tableName", user_table_table_name)), e1);
			}  catch (cn.sunline.adp.core.exception.AdpDaoTooManyRowsException e2) {
				throw new cn.sunline.adp.core.exception.AdpDaoTooManyRowsException(new IString(InternationalConstantDef.SPC_IN.C019,new Params().add("tableName", user_table_table_name)), e2);
			} catch (cn.sunline.adp.core.exception.AdpDaoLockException e3) {
				throw new cn.sunline.adp.core.exception.AdpDaoLockException(new IString(InternationalConstantDef.SPC_IN.C007,new Params().add("tableName", user_table_table_name)), e3);
			}catch (cn.sunline.adp.core.exception.AdpDaoException e4) {
				throw new cn.sunline.adp.core.exception.AdpDaoException(new IString(InternationalConstantDef.SPC_IN.C003,new Params().add("tableName", user_table_table_name)), e4);
			}
		}
		
	}

}

