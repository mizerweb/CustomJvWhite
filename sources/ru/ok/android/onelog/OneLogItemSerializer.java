package ru.ok.android.onelog;

import defpackage.mv8;
import defpackage.x1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class OneLogItemSerializer {
    public static final String COLLECTOR = "collector";
    public static final String COUNT = "count";
    public static final String CUSTOM = "custom";
    public static final String DATA = "data";
    public static final String GROUPS = "groups";
    public static final OneLogItemSerializer INSTANCE = new OneLogItemSerializer();
    public static final String NETWORK = "network";
    public static final String OPERATION = "operation";
    public static final String TIME = "time";
    public static final String TIMESTAMP = "timestamp";
    public static final String TYPE = "type";
    public static final String UID = "uid";

    public void serialize(mv8 mv8Var, OneLogItem oneLogItem) throws IOException {
        mv8Var.p();
        mv8Var.a0("collector");
        mv8Var.p0(oneLogItem.collector());
        mv8Var.a0("timestamp");
        x1 x1Var = (x1) mv8Var;
        x1Var.b(Long.toString(oneLogItem.timestamp()));
        mv8Var.a0("type");
        x1Var.y(oneLogItem.type());
        mv8Var.a0("operation");
        mv8Var.p0(oneLogItem.operation());
        mv8Var.a0("time");
        x1Var.b(Long.toString(oneLogItem.time()));
        String strUid = oneLogItem.uid();
        if (strUid != null) {
            mv8Var.a0("uid");
            mv8Var.p0(strUid);
        }
        String strNetwork = oneLogItem.network();
        if (strNetwork != null) {
            mv8Var.a0("network");
            mv8Var.p0(strNetwork);
        }
        if (oneLogItem.count() != 1) {
            mv8Var.a0("count");
            x1Var.y(oneLogItem.count());
        }
        int iGroupsCount = oneLogItem.groupsCount();
        if (iGroupsCount > 0) {
            mv8Var.a0("groups");
            mv8Var.r();
            for (int i = 0; i < iGroupsCount; i++) {
                x1Var.g(oneLogItem.group(i));
            }
            mv8Var.q();
        }
        int iDataCount = oneLogItem.dataCount();
        if (iDataCount > 0) {
            mv8Var.a0("data");
            mv8Var.r();
            for (int i2 = 0; i2 < iDataCount; i2++) {
                x1Var.g(oneLogItem.datum(i2));
            }
            mv8Var.q();
        }
        int iCustomCount = oneLogItem.customCount();
        if (iCustomCount > 0) {
            mv8Var.a0("custom");
            mv8Var.p();
            for (int i3 = 0; i3 < iCustomCount; i3++) {
                mv8Var.a0(oneLogItem.customKey(i3));
                x1Var.g(oneLogItem.customValue(i3));
            }
            mv8Var.t();
        }
        mv8Var.t();
    }
}
