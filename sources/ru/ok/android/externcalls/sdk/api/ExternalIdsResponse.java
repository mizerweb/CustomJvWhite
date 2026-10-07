package ru.ok.android.externcalls.sdk.api;

import defpackage.hu8;
import defpackage.vu8;
import defpackage.yt1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* JADX INFO: loaded from: classes3.dex */
public class ExternalIdsResponse {
    public static final hu8 INSTANCE = new hu8() { // from class: ru.ok.android.externcalls.sdk.api.ExternalIdsResponse.1
        private void parseIds(Map<yt1, ParticipantId> map, vu8 vu8Var, boolean z) throws JsonTypeMismatchException, IOException {
            vu8Var.p();
            while (vu8Var.hasNext()) {
                String strName = vu8Var.name();
                try {
                    map.put(yt1.a(strName), ParticipantId.withoutDeviceId(vu8Var.F(), z));
                } catch (NumberFormatException unused) {
                    GlobalRTCLogger.log(ExternalIdsResponse.LOG_TAG, "got not parsable internal id '" + strName + "'");
                }
            }
            vu8Var.t();
        }

        @Override // defpackage.hu8
        public ExternalIdsResponse parse(vu8 vu8Var) throws JsonParseException, IOException {
            HashMap map = new HashMap();
            vu8Var.p();
            while (vu8Var.hasNext()) {
                String strName = vu8Var.name();
                strName.getClass();
                if (strName.equals("external_ids")) {
                    parseIds(map, vu8Var, false);
                } else if (strName.equals("anonym_ids")) {
                    parseIds(map, vu8Var, true);
                } else {
                    vu8Var.x();
                }
            }
            vu8Var.t();
            return new ExternalIdsResponse(map);
        }
    };
    private static final String LOG_TAG = "ExternalIdsResponse";
    private final Map<yt1, ParticipantId> internalToExternal;

    public ExternalIdsResponse(Map<yt1, ParticipantId> map) {
        this.internalToExternal = map;
    }

    public Map<yt1, ParticipantId> getMapping() {
        return this.internalToExternal;
    }
}
