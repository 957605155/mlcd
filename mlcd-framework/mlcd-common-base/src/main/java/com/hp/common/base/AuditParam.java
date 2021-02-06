package com.hp.common.base;

public class AuditParam {
    @ApiModelProperty(value="审核的记录编号集合",required=true)
    @NotEmpty(message="审核的记录编号集合不能为空")
    private List<Long> ids;
    @ApiModelProperty(value="审核不通过原因")
    private String rejectReason;
    @ApiModelProperty(value="是否通过(1->否,2->是)",required=true)
    @NotNull(message="通过标识不能为空")
    private YesNoEnum pass;

}
