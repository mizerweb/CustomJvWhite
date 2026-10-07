package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.impl.service.telecom.TelecomCallService;

/* JADX INFO: loaded from: classes2.dex */
public final class pw1 {
    public final ny8 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public pw1(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final PhoneAccountHandle a(ha9 ha9Var, boolean z) {
        return new PhoneAccountHandle(new ComponentName((Context) this.a.getValue(), (Class<?>) (z ? TelecomCallService.class : CallServiceImpl.class)), zo5.h(ha9Var.a, "oneme_calls_"));
    }

    public final boolean b(boolean z, ha9 ha9Var, String str) {
        if (((Set) this.b.computeIfPresent(ha9Var, new mw1(1, new s81(3, str)))) != null) {
            gm0.n("CallRegistrationManager", "account already registered");
            return true;
        }
        TelecomManager telecomManager = (TelecomManager) ((Context) this.a.getValue()).getSystemService(TelecomManager.class);
        if (telecomManager == null) {
            gm0.Y("CallRegistrationManager", "There is no TelecomManager system service");
            telecomManager = null;
        }
        if (telecomManager == null) {
            return false;
        }
        try {
            telecomManager.registerPhoneAccount(PhoneAccount.builder(a(ha9Var, z), "OneMe Calls").setCapabilities(np0.q).addSupportedUriScheme("sip").addSupportedUriScheme("tel").build());
            this.b.computeIfAbsent(ha9Var, new am(2, new qo1(str, 4)));
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallRegistrationManager", "PhoneAccount registered for " + ha9Var, null);
                    return true;
                }
            }
            return true;
        } catch (SecurityException e) {
            nw1 nw1Var = new nw1(qv1.i("Failed to register PhoneAccount for ", ha9Var), e);
            gm0.V("CallRegistrationManager", nw1Var.getMessage(), nw1Var);
            return false;
        } catch (Throwable th) {
            nw1 nw1Var2 = new nw1(qv1.i("Failed to register PhoneAccount for ", ha9Var), th);
            gm0.V("CallRegistrationManager", nw1Var2.getMessage(), nw1Var2);
            return false;
        }
    }

    public final void c(ha9 ha9Var, PhoneAccountHandle phoneAccountHandle) {
        try {
            TelecomManager telecomManager = (TelecomManager) ((Context) this.a.getValue()).getSystemService(TelecomManager.class);
            if (telecomManager == null) {
                gm0.Y("CallRegistrationManager", "There is no TelecomManager system service");
                telecomManager = null;
            }
            if (telecomManager != null) {
                telecomManager.unregisterPhoneAccount(phoneAccountHandle);
            }
            this.b.remove(ha9Var);
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallRegistrationManager", "PhoneAccount unregistered for " + ha9Var, null);
            }
        } catch (RuntimeException e) {
            ow1 ow1Var = new ow1(qv1.i("Failed to unregister PhoneAccount for ", ha9Var), e);
            gm0.V("CallRegistrationManager", ow1Var.getMessage(), ow1Var);
        }
    }
}
