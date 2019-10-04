// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public interface TabOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dictionary.Tab)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string uuid = 2;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string help = 5;</code>
   */
  java.lang.String getHelp();
  /**
   * <code>string help = 5;</code>
   */
  com.google.protobuf.ByteString
      getHelpBytes();

  /**
   * <pre>
   * Attributes
   * </pre>
   *
   * <code>string tableName = 6;</code>
   */
  java.lang.String getTableName();
  /**
   * <pre>
   * Attributes
   * </pre>
   *
   * <code>string tableName = 6;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>int32 sequence = 7;</code>
   */
  int getSequence();

  /**
   * <code>int32 tabLevel = 8;</code>
   */
  int getTabLevel();

  /**
   * <pre>
   * </pre>
   *
   * <code>bool isActive = 9;</code>
   */
  boolean getIsActive();

  /**
   * <code>bool isSingleRow = 10;</code>
   */
  boolean getIsSingleRow();

  /**
   * <code>bool isAdvancedTab = 11;</code>
   */
  boolean getIsAdvancedTab();

  /**
   * <code>bool isHasTree = 12;</code>
   */
  boolean getIsHasTree();

  /**
   * <code>bool isInfoTab = 13;</code>
   */
  boolean getIsInfoTab();

  /**
   * <code>bool isSortTab = 14;</code>
   */
  boolean getIsSortTab();

  /**
   * <code>bool isTranslationTab = 15;</code>
   */
  boolean getIsTranslationTab();

  /**
   * <code>bool isReadOnly = 16;</code>
   */
  boolean getIsReadOnly();

  /**
   * <code>bool isInsertRecord = 17;</code>
   */
  boolean getIsInsertRecord();

  /**
   * <code>bool isView = 18;</code>
   */
  boolean getIsView();

  /**
   * <code>bool isDeleteable = 19;</code>
   */
  boolean getIsDeleteable();

  /**
   * <code>bool isDocument = 20;</code>
   */
  boolean getIsDocument();

  /**
   * <code>int32 accessLevel = 21;</code>
   */
  int getAccessLevel();

  /**
   * <code>string linkColumnName = 22;</code>
   */
  java.lang.String getLinkColumnName();
  /**
   * <code>string linkColumnName = 22;</code>
   */
  com.google.protobuf.ByteString
      getLinkColumnNameBytes();

  /**
   * <code>string parentColumnName = 23;</code>
   */
  java.lang.String getParentColumnName();
  /**
   * <code>string parentColumnName = 23;</code>
   */
  com.google.protobuf.ByteString
      getParentColumnNameBytes();

  /**
   * <code>string displayLogic = 24;</code>
   */
  java.lang.String getDisplayLogic();
  /**
   * <code>string displayLogic = 24;</code>
   */
  com.google.protobuf.ByteString
      getDisplayLogicBytes();

  /**
   * <code>string commitWarning = 25;</code>
   */
  java.lang.String getCommitWarning();
  /**
   * <code>string commitWarning = 25;</code>
   */
  com.google.protobuf.ByteString
      getCommitWarningBytes();

  /**
   * <code>string query = 26;</code>
   */
  java.lang.String getQuery();
  /**
   * <code>string query = 26;</code>
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <code>string whereClause = 27;</code>
   */
  java.lang.String getWhereClause();
  /**
   * <code>string whereClause = 27;</code>
   */
  com.google.protobuf.ByteString
      getWhereClauseBytes();

  /**
   * <code>string orderByClause = 28;</code>
   */
  java.lang.String getOrderByClause();
  /**
   * <code>string orderByClause = 28;</code>
   */
  com.google.protobuf.ByteString
      getOrderByClauseBytes();

  /**
   * <code>string parentTabUuid = 29;</code>
   */
  java.lang.String getParentTabUuid();
  /**
   * <code>string parentTabUuid = 29;</code>
   */
  com.google.protobuf.ByteString
      getParentTabUuidBytes();

  /**
   * <pre>
   * External Info
   * </pre>
   *
   * <code>.dictionary.ContextInfo contextInfo = 30;</code>
   */
  boolean hasContextInfo();
  /**
   * <pre>
   * External Info
   * </pre>
   *
   * <code>.dictionary.ContextInfo contextInfo = 30;</code>
   */
  org.spin.grpc.util.ContextInfo getContextInfo();
  /**
   * <pre>
   * External Info
   * </pre>
   *
   * <code>.dictionary.ContextInfo contextInfo = 30;</code>
   */
  org.spin.grpc.util.ContextInfoOrBuilder getContextInfoOrBuilder();

  /**
   * <code>repeated .dictionary.Process processes = 31;</code>
   */
  java.util.List<org.spin.grpc.util.Process> 
      getProcessesList();
  /**
   * <code>repeated .dictionary.Process processes = 31;</code>
   */
  org.spin.grpc.util.Process getProcesses(int index);
  /**
   * <code>repeated .dictionary.Process processes = 31;</code>
   */
  int getProcessesCount();
  /**
   * <code>repeated .dictionary.Process processes = 31;</code>
   */
  java.util.List<? extends org.spin.grpc.util.ProcessOrBuilder> 
      getProcessesOrBuilderList();
  /**
   * <code>repeated .dictionary.Process processes = 31;</code>
   */
  org.spin.grpc.util.ProcessOrBuilder getProcessesOrBuilder(
      int index);

  /**
   * <code>repeated .dictionary.Field fields = 32;</code>
   */
  java.util.List<org.spin.grpc.util.Field> 
      getFieldsList();
  /**
   * <code>repeated .dictionary.Field fields = 32;</code>
   */
  org.spin.grpc.util.Field getFields(int index);
  /**
   * <code>repeated .dictionary.Field fields = 32;</code>
   */
  int getFieldsCount();
  /**
   * <code>repeated .dictionary.Field fields = 32;</code>
   */
  java.util.List<? extends org.spin.grpc.util.FieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <code>repeated .dictionary.Field fields = 32;</code>
   */
  org.spin.grpc.util.FieldOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <code>.dictionary.FieldGroup fieldGroup = 33;</code>
   */
  boolean hasFieldGroup();
  /**
   * <code>.dictionary.FieldGroup fieldGroup = 33;</code>
   */
  org.spin.grpc.util.FieldGroup getFieldGroup();
  /**
   * <code>.dictionary.FieldGroup fieldGroup = 33;</code>
   */
  org.spin.grpc.util.FieldGroupOrBuilder getFieldGroupOrBuilder();
}
