import eventStormingYaml from "./eventStorming-openapi.yaml";
import bpmnYaml from "./bpmn-openapi.yaml";
import YAML from "json2yaml";

let apiSpec = "";

let eventStormingSpec = YAML.stringify(eventStormingYaml);
apiSpec += eventStormingSpec;

let bpmnSpec = YAML.stringify(bpmnYaml);
apiSpec += bpmnSpec;


export default apiSpec;