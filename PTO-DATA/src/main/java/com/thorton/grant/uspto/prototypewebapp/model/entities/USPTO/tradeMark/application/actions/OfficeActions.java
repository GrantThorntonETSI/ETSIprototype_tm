package com.thorton.grant.uspto.prototypewebapp.model.entities.USPTO.tradeMark.application.actions;

import com.thorton.grant.uspto.prototypewebapp.model.entities.USPTO.tradeMark.application.BaseTrademarkApplication;
import com.thorton.grant.uspto.prototypewebapp.model.entities.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Objects;


@Entity
public class OfficeActions extends BaseEntity {


    private String officeAction;

    private String oficeActionCode;

    @OneToOne
    private BaseTrademarkApplication application;




    public String getOfficeAction() {
        return officeAction;
    }

    public void setOfficeAction(String officeAction) {
        this.officeAction = officeAction;
    }

    public String getOficeActionCode() {
        return oficeActionCode;
    }

    public void setOficeActionCode(String oficeActionCode) {
        this.oficeActionCode = oficeActionCode;
    }


    public BaseTrademarkApplication getApplication() {
        return application;
    }

    public void setApplication(BaseTrademarkApplication application) {
        this.application = application;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeActions that = (OfficeActions) o;
        return Objects.equals(officeAction, that.officeAction) &&
                Objects.equals(oficeActionCode, that.oficeActionCode) &&
                Objects.equals(application, that.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeAction, oficeActionCode, application);
    }


    @Override
    public String toString() {
        return "OfficeActions{" +
                "officeAction='" + officeAction + '\'' +
                ", oficeActionCode='" + oficeActionCode + '\'' +
                ", application=" + application +
                '}';
    }
}
