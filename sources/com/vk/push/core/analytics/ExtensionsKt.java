package com.vk.push.core.analytics;

import android.database.sqlite.SQLiteException;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.base.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.ipc.BindingDiedException;
import com.vk.push.core.ipc.BindingFailedException;
import com.vk.push.core.ipc.ComponentCreationFailedException;
import com.vk.push.core.ipc.InvalidSignatureException;
import com.vk.push.core.ipc.NoHostsToBindException;
import com.vk.push.core.ipc.SecurityBindingException;
import com.vk.push.core.ipc.UnknownBindingException;
import com.vk.push.core.utils.MessageIdUtilsKt;
import defpackage.ei6;
import defpackage.poe;
import defpackage.qf7;
import defpackage.r5h;
import defpackage.roe;
import defpackage.ww3;
import defpackage.yw3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\u0002\u0010\b\u001a$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062*\b\u0002\u0010\n\u001a$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0012\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0015\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0015\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u000f\u001a;\u0010\u001a\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001d\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u000f\u001a1\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a1\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b!\u0010$\u001a1\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020%¢\u0006\u0004\b!\u0010&\u001a1\u0010(\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b(\u0010)\u001a7\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b!\u0010\u001b\u001a\u0011\u0010*\u001a\u00020\u0002*\u00020\u001f¢\u0006\u0004\b*\u0010+*\"\u0010,\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"T", "", "", "Lcom/vk/push/core/analytics/Params;", "Lroe;", "result", "Lkotlin/Function2;", "Lsbi;", "onSuccess", "", "onFailure", "setResult", "(Ljava/util/Map;Ljava/lang/Object;Lqf7;Lqf7;)V", "pushToken", "setPushToken", "(Ljava/util/Map;Ljava/lang/String;)V", "", "intervalMs", "setIntervalMs", "(Ljava/util/Map;J)V", "messageId", "setPushId", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "pushId", "", "messageIds", "setPushIds", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "clientPackageName", "setClientPackageName", "key", "", "boolean", "set", "(Ljava/util/Map;Ljava/lang/String;Z)V", SdkMetricStatEvent.VALUE_KEY, "(Ljava/util/Map;Ljava/lang/String;J)V", "", "(Ljava/util/Map;Ljava/lang/String;I)V", "error", "setErrorMessage", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Throwable;)V", "asString", "(Z)Ljava/lang/String;", "Params", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ExtensionsKt {
    public static final String asString(boolean z) {
        return z ? "1" : "0";
    }

    public static final void set(Map<String, String> map, String str, List<String> list) {
        map.put(str, ww3.z1(list, null, "[", "]", null, 57));
    }

    public static final void setClientPackageName(Map<String, String> map, String str) {
        map.put("client_package_name", str);
    }

    public static final void setErrorMessage(Map<String, String> map, String str, Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            map.put(str, r5h.u1(20, message));
        }
    }

    public static final void setIntervalMs(Map<String, String> map, long j) {
        map.put("interval", String.valueOf(j));
    }

    public static final void setPushId(Map<String, String> map, String str, String str2) {
        map.put("push_id", MessageIdUtilsKt.formPushId(str, str2));
    }

    public static final void setPushIds(Map<String, String> map, String str, List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageIdUtilsKt.formPushId(str, (String) it.next()));
        }
        set(map, "push_ids", arrayList);
    }

    public static final void setPushToken(Map<String, String> map, String str) {
        if (str == null) {
            str = "";
        }
        map.put("push_token", str);
    }

    public static final <T> void setResult(Map<String, String> map, Object obj, qf7 qf7Var, qf7 qf7Var2) {
        String strConcat;
        boolean z = obj instanceof poe;
        map.put("result", !z ? "success" : "failure");
        if (!z) {
            qf7Var.invoke(map, obj);
        }
        Throwable thA = roe.a(obj);
        if (thA != null) {
            if (thA instanceof TimeoutCancellationException) {
                strConcat = "timeout_error";
            } else if (thA instanceof HostIsNotMasterException) {
                strConcat = "host_is_not_master";
            } else if (thA instanceof SdkIsNotInitializedException) {
                strConcat = "sdk_is_not_initialized";
            } else if (thA instanceof TransferredIpcDataException) {
                strConcat = "transferred_ipc_data";
            } else if (thA instanceof NoHostsToBindException) {
                NoHostsToBindException noHostsToBindException = (NoHostsToBindException) thA;
                if (noHostsToBindException instanceof BindingFailedException) {
                    strConcat = "binding_failed";
                } else if (noHostsToBindException instanceof InvalidSignatureException) {
                    strConcat = "invalid_signature";
                } else if (noHostsToBindException instanceof ComponentCreationFailedException) {
                    strConcat = "component_creation_failed";
                } else if (noHostsToBindException instanceof SecurityBindingException) {
                    strConcat = "security_exception";
                } else {
                    strConcat = noHostsToBindException instanceof UnknownBindingException ? "unknown_binding_exception ".concat(r5h.u1(20, noHostsToBindException.getClass().getSimpleName())) : "no_hosts_to_bind";
                }
            } else if (thA instanceof BindingDiedException) {
                strConcat = "binding_died";
            } else if (thA instanceof IllegalStateException) {
                strConcat = "illegal_state";
            } else if (thA instanceof IllegalArgumentException) {
                strConcat = "illegal_argument";
            } else if (thA instanceof SQLiteException) {
                strConcat = "sqlite_error";
            } else {
                strConcat = thA instanceof IOException ? "io_error" : "unknown_exception ".concat(r5h.u1(20, thA.getClass().getSimpleName()));
            }
            map.put("reason", strConcat);
            setErrorMessage(map, "error_message", thA);
            qf7Var2.invoke(map, thA);
        }
    }

    public static /* synthetic */ void setResult$default(Map map, Object obj, qf7 qf7Var, qf7 qf7Var2, int i, Object obj2) {
        if ((i & 2) != 0) {
            qf7Var = ei6.b;
        }
        if ((i & 4) != 0) {
            qf7Var2 = ei6.c;
        }
        setResult(map, obj, qf7Var, qf7Var2);
    }

    public static final void setPushId(Map<String, String> map, String str) {
        if (str == null) {
            str = "";
        }
        map.put("push_id", str);
    }

    public static final void set(Map<String, String> map, String str, long j) {
        map.put(str, String.valueOf(j));
    }

    public static final void set(Map<String, String> map, String str, int i) {
        map.put(str, String.valueOf(i));
    }

    public static final void set(Map<String, String> map, String str, boolean z) {
        map.put(str, asString(z));
    }
}
