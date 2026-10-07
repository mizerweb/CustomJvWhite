package ru.ok.android.externcalls.sdk.feature.internal.commands;

import defpackage.af7;
import defpackage.bu1;
import defpackage.c76;
import defpackage.cf7;
import defpackage.nx;
import defpackage.oi1;
import defpackage.ore;
import defpackage.ox;
import defpackage.pi1;
import defpackage.q4g;
import defpackage.qi1;
import defpackage.wre;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feature.exception.ConversationFeatureException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lkotlin/Function0;", "Lorg/json/JSONObject;", "createParamsAction", "createParamsOrPassExceptionToOnError", "(Lcf7;Laf7;)Lorg/json/JSONObject;", "Loi1;", "feature", "onComplete", "enableFeatureForAll", "(Loi1;Laf7;Lcf7;)V", "", "Lbu1;", "roles", "enableFeatureForRoles", "(Loi1;Ljava/util/Set;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lqi1;", "paramsCreator", "Lqi1;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationFeatureCommandExecutorImpl implements ConversationFeatureCommandExecutor {
    private final qi1 paramsCreator = new qi1();
    private final SignalingProvider signalingProvider;

    public ConversationFeatureCommandExecutorImpl(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    private final JSONObject createParamsOrPassExceptionToOnError(cf7 onError, af7 createParamsAction) {
        try {
            return (JSONObject) createParamsAction.invoke();
        } catch (JSONException e) {
            if (onError == null) {
                return null;
            }
            onError.invoke(new ConversationFeatureException("Can't create params for the method", e));
            return null;
        }
    }

    public static final JSONObject enableFeatureForRoles$lambda$0(ConversationFeatureCommandExecutorImpl conversationFeatureCommandExecutorImpl, oi1 oi1Var, Set set) throws JSONException {
        String str;
        String str2;
        conversationFeatureCommandExecutorImpl.paramsCreator.getClass();
        oi1Var.getClass();
        set.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "enable-feature-for-roles");
        int i = pi1.$EnumSwitchMapping$0[oi1Var.ordinal()];
        if (i == 1) {
            str = "ADD_PARTICIPANT";
        } else if (i == 2) {
            str = "RECORD";
        } else if (i == 3) {
            str = "MOVIE_SHARE";
        } else {
            if (i != 4) {
                ore.o();
                return null;
            }
            str = "ASR";
        }
        jSONObject.put("feature", str);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int i2 = pi1.$EnumSwitchMapping$1[((bu1) it.next()).ordinal()];
            if (i2 == 1) {
                str2 = "CREATOR";
            } else if (i2 == 2) {
                str2 = "ADMIN";
            } else {
                if (i2 != 3) {
                    ore.o();
                    return null;
                }
                str2 = "SPEAKER";
            }
            jSONArray.put(str2);
        }
        jSONObject.put("roles", jSONArray);
        return jSONObject;
    }

    public static final void enableFeatureForRoles$lambda$1(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void enableFeatureForRoles$lambda$2(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new ConversationFeatureException("Command error " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForAll(oi1 feature, af7 onComplete, cf7 onError) {
        enableFeatureForRoles(feature, c76.a, onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForRoles(oi1 feature, Set<? extends bu1> roles, af7 onComplete, cf7 onError) {
        JSONObject jSONObjectCreateParamsOrPassExceptionToOnError;
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null || (jSONObjectCreateParamsOrPassExceptionToOnError = createParamsOrPassExceptionToOnError(onError, new wre(this, feature, roles, 12))) == null) {
            return;
        }
        q4gVar.l(jSONObjectCreateParamsOrPassExceptionToOnError, new nx(3, onComplete), new ox(3, onError));
    }
}
