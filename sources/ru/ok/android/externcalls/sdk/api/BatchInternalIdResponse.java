package ru.ok.android.externcalls.sdk.api;

import defpackage.hu8;
import defpackage.p51;
import defpackage.vu8;
import defpackage.yt1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
public class BatchInternalIdResponse {
    public static final hu8 PARSER = new p51(16);
    public final Map<ParticipantId, yt1> externalToInternalIdsMap;

    public BatchInternalIdResponse(Map<ParticipantId, yt1> map) {
        this.externalToInternalIdsMap = map;
    }

    public static BatchInternalIdResponse parse(vu8 vu8Var) throws JsonTypeMismatchException, IOException {
        HashMap map = new HashMap();
        vu8Var.p();
        while (vu8Var.hasNext()) {
            if (vu8Var.name().equals("ids")) {
                readIdsArray(vu8Var, map);
            } else {
                vu8Var.x();
            }
        }
        vu8Var.t();
        return new BatchInternalIdResponse(map);
    }

    private static ParticipantId readExternalId(vu8 vu8Var) throws JsonTypeMismatchException, IOException {
        vu8Var.p();
        String strF = null;
        Boolean boolValueOf = null;
        while (vu8Var.hasNext()) {
            String strName = vu8Var.name();
            strName.getClass();
            if (strName.equals("id")) {
                strF = vu8Var.F();
            } else if (strName.equals("ok_anonym")) {
                boolValueOf = Boolean.valueOf(vu8Var.V());
            } else {
                vu8Var.x();
            }
        }
        vu8Var.t();
        if (strF == null || boolValueOf == null) {
            return null;
        }
        return ParticipantId.withoutDeviceId(strF, boolValueOf.booleanValue());
    }

    private static void readIdMapping(vu8 vu8Var, Map<ParticipantId, yt1> map) throws JsonTypeMismatchException, IOException {
        vu8Var.p();
        yt1 yt1VarA = null;
        ParticipantId externalId = null;
        while (vu8Var.hasNext()) {
            String strName = vu8Var.name();
            strName.getClass();
            if (strName.equals("external_user_id")) {
                externalId = readExternalId(vu8Var);
            } else if (strName.equals("ok_user_id")) {
                yt1VarA = yt1.a(vu8Var.F());
            } else {
                vu8Var.x();
            }
        }
        vu8Var.t();
        if (yt1VarA == null || externalId == null) {
            return;
        }
        map.put(externalId, yt1VarA);
    }

    private static void readIdsArray(vu8 vu8Var, Map<ParticipantId, yt1> map) throws JsonTypeMismatchException, IOException {
        vu8Var.r();
        while (vu8Var.hasNext()) {
            readIdMapping(vu8Var, map);
        }
        vu8Var.q();
    }
}
