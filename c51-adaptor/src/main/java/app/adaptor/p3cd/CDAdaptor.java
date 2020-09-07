package app.adaptor.p3cd;

/**
 * CDAdaptor
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class CDAdaptor extends CD implements ITarget {

    @Override
    public void function1() {
        CD.staticFunction1();
    }

    @Override
    public void function2() {
        super.uglyNamingFunction2();
    }

    @Override
    public void function3(ParamsWrapperDefinition paramsWrapper) {
        super.tooManyParamsFunction3(paramsWrapper.getParamA(), paramsWrapper.getParamB());
    }

    @Override
    public void function4() {
        //
    }

}
