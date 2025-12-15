<%@ taglib prefix="forms" tagdir="/WEB-INF/tags/forms" %>
<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<%@ taglib prefix="l" tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bs" tagdir="/WEB-INF/tags" %>


<jsp:useBean id="propertiesBean" scope="request" type="jetbrains.buildServer.controllers.BasePropertiesBean"/>
<jsp:useBean id="params" class="jetbrains.buildServer.rust.CargoParametersProvider"/>

<tr>
    <th class="noBorder">Format</th>
    <td>
        <props:checkboxProperty name="${params.fmtCheckKey}"/>
        <label for="${params.fmtCheckKey}">Run cargo fmt --check, reporting an error when current source code is not correctly formatted</label>
    </td>
</tr>

<tr class="advancedSetting">
    <th><label for="${params.fmtManifestKey}">Manifest:</label></th>
    <td>
        <props:textProperty name="${params.fmtManifestKey}" className="longField"/>
        <span class="error" id="error_${params.fmtManifestKey}"></span>
        <span class="smallNote">Path to the manifest to use cargo with.</span>
    </td>
</tr>