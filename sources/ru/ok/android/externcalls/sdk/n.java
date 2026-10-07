package ru.ok.android.externcalls.sdk;

import defpackage.n4g;
import defpackage.sg4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg4 b;

    public /* synthetic */ n(sg4 sg4Var, int i) {
        this.a = i;
        this.b = sg4Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) throws JSONException {
        int i = this.a;
        sg4 sg4Var = this.b;
        switch (i) {
            case 0:
                ConversationImpl.lambda$addParticipant$28(sg4Var, jSONObject);
                break;
            case 1:
                ConversationImpl.lambda$addParticipant$30(sg4Var, jSONObject);
                break;
            default:
                ConversationImpl.lambda$setCallOptionEnabled$25(sg4Var, jSONObject);
                break;
        }
    }
}
