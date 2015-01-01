package org.codelibs.robot.db.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.codelibs.robot.db.allcommon.DBCurrent;
import org.codelibs.robot.db.allcommon.DBFluteConfig;
import org.codelibs.robot.db.exentity.customize.AccessResultDiff;
import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.dbmeta.info.UniqueInfo;
import org.dbflute.dbmeta.name.TableSqlName;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;

/**
 * The DB meta of AccessResultDiff. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AccessResultDiffDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AccessResultDiffDbm _instance = new AccessResultDiffDbm();

    private AccessResultDiffDbm() {
    }

    public static AccessResultDiffDbm getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    public String getProjectName() {
        return DBCurrent.getInstance().projectName();
    }

    @Override
    public String getProjectPrefix() {
        return DBCurrent.getInstance().projectPrefix();
    }

    @Override
    public String getGenerationGapBasePrefix() {
        return DBCurrent.getInstance().generationGapBasePrefix();
    }

    @Override
    public DBDef getCurrentDBDef() {
        return DBCurrent.getInstance().currentDBDef();
    }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        xsetupEpg();
    }

    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getId(),
                (et, vl) -> ((AccessResultDiff) et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getSessionId(),
                (et, vl) -> ((AccessResultDiff) et).setSessionId((String) vl),
                "sessionId");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getRuleId(),
                (et, vl) -> ((AccessResultDiff) et).setRuleId((String) vl),
                "ruleId");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getUrl(),
                (et, vl) -> ((AccessResultDiff) et).setUrl((String) vl), "url");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getParentUrl(),
                (et, vl) -> ((AccessResultDiff) et).setParentUrl((String) vl),
                "parentUrl");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getStatus(),
                (et, vl) -> ((AccessResultDiff) et).setStatus(cti(vl)),
                "status");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getHttpStatusCode(), (
                et, vl) -> ((AccessResultDiff) et).setHttpStatusCode(cti(vl)),
                "httpStatusCode");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getMethod(),
                (et, vl) -> ((AccessResultDiff) et).setMethod((String) vl),
                "method");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getMimeType(),
                (et, vl) -> ((AccessResultDiff) et).setMimeType((String) vl),
                "mimeType");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getContentLength(), (
                et, vl) -> ((AccessResultDiff) et).setContentLength(ctl(vl)),
                "contentLength");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getExecutionTime(), (
                et, vl) -> ((AccessResultDiff) et).setExecutionTime(cti(vl)),
                "executionTime");
        setupEpg(_epgMap, et -> ((AccessResultDiff) et).getCreateTime(), (et,
                vl) -> ((AccessResultDiff) et).setCreateTime(ctl(vl)),
                "createTime");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String prop) {
        return doFindEpg(_epgMap, prop);
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "AccessResultDiff";

    protected final String _tablePropertyName = "accessResultDiff";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "AccessResultDiff", _tableDbName);
    {
        _tableSqlName.xacceptFilter(DBFluteConfig.getInstance()
                .getTableSqlNameFilter());
    }

    @Override
    public String getTableDbName() {
        return _tableDbName;
    }

    @Override
    public String getTablePropertyName() {
        return _tablePropertyName;
    }

    @Override
    public TableSqlName getTableSqlName() {
        return _tableSqlName;
    }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null,
            Long.class, "id", null, false, false, false, "BIGINT", 20, 0, null,
            false, null, null, null, null, null, false);

    protected final ColumnInfo _columnSessionId = cci("SESSION_ID",
            "SESSION_ID", null, null, String.class, "sessionId", null, false,
            false, false, "VARCHAR", 20, 0, null, false, null, null, null,
            null, null, false);

    protected final ColumnInfo _columnRuleId = cci("RULE_ID", "RULE_ID", null,
            null, String.class, "ruleId", null, false, false, false, "VARCHAR",
            20, 0, null, false, null, null, null, null, null, false);

    protected final ColumnInfo _columnUrl = cci("URL", "URL", null, null,
            String.class, "url", null, false, false, false, "VARCHAR", 21845,
            0, null, false, null, null, null, null, null, false);

    protected final ColumnInfo _columnParentUrl = cci("PARENT_URL",
            "PARENT_URL", null, null, String.class, "parentUrl", null, false,
            false, false, "VARCHAR", 21845, 0, null, false, null, null, null,
            null, null, false);

    protected final ColumnInfo _columnStatus = cci("STATUS", "STATUS", null,
            null, Integer.class, "status", null, false, false, false, "INT",
            11, 0, null, false, null, null, null, null, null, false);

    protected final ColumnInfo _columnHttpStatusCode = cci("HTTP_STATUS_CODE",
            "HTTP_STATUS_CODE", null, null, Integer.class, "httpStatusCode",
            null, false, false, false, "INT", 11, 0, null, false, null, null,
            null, null, null, false);

    protected final ColumnInfo _columnMethod = cci("METHOD", "METHOD", null,
            null, String.class, "method", null, false, false, false, "VARCHAR",
            10, 0, null, false, null, null, null, null, null, false);

    protected final ColumnInfo _columnMimeType = cci("MIME_TYPE", "MIME_TYPE",
            null, null, String.class, "mimeType", null, false, false, false,
            "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);

    protected final ColumnInfo _columnContentLength = cci("CONTENT_LENGTH",
            "CONTENT_LENGTH", null, null, Long.class, "contentLength", null,
            false, false, false, "BIGINT", 20, 0, null, false, null, null,
            null, null, null, false);

    protected final ColumnInfo _columnExecutionTime = cci("EXECUTION_TIME",
            "EXECUTION_TIME", null, null, Integer.class, "executionTime", null,
            false, false, false, "INT", 11, 0, null, false, null, null, null,
            null, null, false);

    protected final ColumnInfo _columnCreateTime = cci("CREATE_TIME",
            "CREATE_TIME", null, null, Long.class, "createTime", null, false,
            false, false, "BIGINT", 20, 0, null, false, null, null, null, null,
            null, false);

    /**
     * ID: {BIGINT(20), refers to ACCESS_RESULT.ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() {
        return _columnId;
    }

    /**
     * SESSION_ID: {VARCHAR(20), refers to ACCESS_RESULT.SESSION_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSessionId() {
        return _columnSessionId;
    }

    /**
     * RULE_ID: {VARCHAR(20), refers to ACCESS_RESULT.RULE_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleId() {
        return _columnRuleId;
    }

    /**
     * URL: {VARCHAR(21845), refers to ACCESS_RESULT.URL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrl() {
        return _columnUrl;
    }

    /**
     * PARENT_URL: {VARCHAR(21845), refers to ACCESS_RESULT.PARENT_URL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentUrl() {
        return _columnParentUrl;
    }

    /**
     * STATUS: {INT(11), refers to ACCESS_RESULT.STATUS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatus() {
        return _columnStatus;
    }

    /**
     * HTTP_STATUS_CODE: {INT(11), refers to ACCESS_RESULT.HTTP_STATUS_CODE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHttpStatusCode() {
        return _columnHttpStatusCode;
    }

    /**
     * METHOD: {VARCHAR(10), refers to ACCESS_RESULT.METHOD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMethod() {
        return _columnMethod;
    }

    /**
     * MIME_TYPE: {VARCHAR(100), refers to ACCESS_RESULT.MIME_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMimeType() {
        return _columnMimeType;
    }

    /**
     * CONTENT_LENGTH: {BIGINT(20), refers to ACCESS_RESULT.CONTENT_LENGTH}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnContentLength() {
        return _columnContentLength;
    }

    /**
     * EXECUTION_TIME: {INT(11), refers to ACCESS_RESULT.EXECUTION_TIME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExecutionTime() {
        return _columnExecutionTime;
    }

    /**
     * CREATE_TIME: {BIGINT(20), refers to ACCESS_RESULT.CREATE_TIME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateTime() {
        return _columnCreateTime;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnSessionId());
        ls.add(columnRuleId());
        ls.add(columnUrl());
        ls.add(columnParentUrl());
        ls.add(columnStatus());
        ls.add(columnHttpStatusCode());
        ls.add(columnMethod());
        ls.add(columnMimeType());
        ls.add(columnContentLength());
        ls.add(columnExecutionTime());
        ls.add(columnCreateTime());
        return ls;
    }

    {
        initializeInformationResource();
    }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    @Override
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException(
                "The table does not have primary key: " + getTableDbName());
    }

    @Override
    public boolean hasPrimaryKey() {
        return false;
    }

    @Override
    public boolean hasCompoundPrimaryKey() {
        return false;
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    @Override
    public String getEntityTypeName() {
        return "org.codelibs.robot.db.exentity.customize.AccessResultDiff";
    }

    @Override
    public String getConditionBeanTypeName() {
        return null;
    }

    @Override
    public String getBehaviorTypeName() {
        return null;
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<AccessResultDiff> getEntityType() {
        return AccessResultDiff.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public AccessResultDiff newEntity() {
        return new AccessResultDiff();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity et,
            final Map<String, ? extends Object> mp) {
        doAcceptPrimaryKeyMap((AccessResultDiff) et, mp);
    }

    @Override
    public void acceptAllColumnMap(final Entity et,
            final Map<String, ? extends Object> mp) {
        doAcceptAllColumnMap((AccessResultDiff) et, mp);
    }

    @Override
    public Map<String, Object> extractPrimaryKeyMap(final Entity et) {
        return doExtractPrimaryKeyMap(et);
    }

    @Override
    public Map<String, Object> extractAllColumnMap(final Entity et) {
        return doExtractAllColumnMap(et);
    }
}