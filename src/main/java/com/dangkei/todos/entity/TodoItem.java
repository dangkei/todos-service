/**
 * 
 */
package com.dangkei.todos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dangkei.todos.common.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 *
 */

@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@EqualsAndHashCode(callSuper=false)
@TableName("tbl_todoitems")
public class TodoItem extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private String category;
	@TableField("title")
	private String title;
	@TableField("note")
	private String note;
	@TableField("status")
	private String status;
}
