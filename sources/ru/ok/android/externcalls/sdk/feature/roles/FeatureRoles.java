package ru.ok.android.externcalls.sdk.feature.roles;

import defpackage.bu1;
import defpackage.c76;
import defpackage.cqk;
import defpackage.j95;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "", "<init>", "()V", "EnabledForAll", "EnabledForRoles", "Companion", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForAll;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class FeatureRoles {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForAll;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "<init>", "()V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EnabledForAll extends FeatureRoles {
        public static final EnabledForAll INSTANCE = new EnabledForAll();

        private EnabledForAll() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "", "Lbu1;", "roles", "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getRoles", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnabledForRoles extends FeatureRoles {
        private final Set<bu1> roles;

        /* JADX WARN: Multi-variable type inference failed */
        public EnabledForRoles(Set<? extends bu1> set) {
            super(null);
            this.roles = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EnabledForRoles copy$default(EnabledForRoles enabledForRoles, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = enabledForRoles.roles;
            }
            return enabledForRoles.copy(set);
        }

        public final Set<bu1> component1() {
            return this.roles;
        }

        public final EnabledForRoles copy(Set<? extends bu1> roles) {
            return new EnabledForRoles(roles);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnabledForRoles) && cqk.d(this.roles, ((EnabledForRoles) other).roles);
        }

        public final Set<bu1> getRoles() {
            return this.roles;
        }

        public int hashCode() {
            return this.roles.hashCode();
        }

        public String toString() {
            return "EnabledForRoles(roles=" + this.roles + ")";
        }
    }

    public /* synthetic */ FeatureRoles(j95 j95Var) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$Companion;", "", "<init>", "()V", "createDisabledForAll", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final EnabledForRoles createDisabledForAll() {
            return new EnabledForRoles(c76.a);
        }

        private Companion() {
        }
    }

    private FeatureRoles() {
    }
}
